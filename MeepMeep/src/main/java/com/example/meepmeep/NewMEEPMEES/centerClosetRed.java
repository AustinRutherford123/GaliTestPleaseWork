package com.example.meepmeep.NewMEEPMEES;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeBlueDark;
import com.noahbres.meepmeep.roadrunner.Constraints;
import com.noahbres.meepmeep.roadrunner.DriveTrainType;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class centerClosetRed {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(700);
        Pose2d startPose = new Pose2d(16, -61, Math.toRadians(-90));
        ColorSchemeBlueDark colorSchemeBlueDark = new ColorSchemeBlueDark();
        Constraints myBotConstraints = new Constraints(42.5, 62.890756998077265, 3.358942, Math.toRadians(180), 13.4);
        RoadRunnerBotEntity myBot = new RoadRunnerBotEntity(meepMeep,
                myBotConstraints,
                16,
                18,
                startPose,
                colorSchemeBlueDark,
                1,
                DriveTrainType.MECANUM,
                true);
        // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                /*
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(startPose)
                                .back(15)
                                .turn(Math.toRadians(90))
                                .back(4)
                                .splineToLinearHeading((startPose).plus(new Pose2d(-11, 20, Math.toRadians(90))), Math.toRadians(180))
                                .splineToLinearHeading((startPose).plus(new Pose2d(-11, 41, Math.toRadians(90))), Math.toRadians(90))
                                //drop pixels
                                .waitSeconds(1)
                                .back(3)
                                .splineToLinearHeading((startPose).plus(new Pose2d(-16, 49.5, Math.toRadians(-90))), Math.toRadians(180))
                                .forward(4)
                                //grab pixel
                                .waitSeconds(1)
                                .back(10)
                                .splineToLinearHeading((startPose).plus(new Pose2d(0, 51.5, Math.toRadians(-90))), Math.toRadians(0))
                                .splineToLinearHeading((startPose).plus(new Pose2d(65, 51.5, Math.toRadians(-90))), Math.toRadians(0))
                                .splineToLinearHeading((startPose).plus(new Pose2d(80, 34, Math.toRadians(-90))), Math.toRadians(-90))
                                .splineToLinearHeading((startPose).plus(new Pose2d(87, 26, Math.toRadians(-90))), Math.toRadians(0))
                                .waitSeconds(1)
                                .build()
                );

                 */

        myBot.followTrajectorySequence(myBot.getDrive()
                .trajectorySequenceBuilder(startPose)
                .back(9)
                .splineTo((new Vector2d(startPose.getX(),startPose.getY())).plus(new Vector2d(2, 28)), Math.toRadians(90))
                //drop pixels
                .forward(10)
                .turn(Math.toRadians(-90))
                .waitSeconds(0.2)
                .back(1)
                .splineToLinearHeading((startPose).plus(new Pose2d(30, 26, Math.toRadians(-90))), Math.toRadians(0))
                .build()
        );

        meepMeep.setBackground(MeepMeep.Background.FIELD_CENTERSTAGE_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}