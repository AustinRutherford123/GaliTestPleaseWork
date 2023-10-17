package org.firstinspires.ftc.teamcode.Roadrunner.Testing;

import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Roadrunner.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.Roadrunner.trajectorysequence.TrajectorySequence;
@Disabled
@Config
@Autonomous
public class Turn90 extends LinearOpMode {
    public TestHwMap robot = new TestHwMap();

    //public double xTarget = 23.5;
    //public double yTarget = 0;

    public void runOpMode(){
        robot.init(hardwareMap);
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);

        Pose2d startPose = new Pose2d(0, 0, Math.toRadians(0));
        drive.setPoseEstimate(startPose);

        waitForStart();

        if(isStopRequested()) return;

        drive.turn(Math.toRadians(90));
    }

}
