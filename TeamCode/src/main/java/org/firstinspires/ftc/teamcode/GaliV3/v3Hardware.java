package org.firstinspires.ftc.teamcode.GaliV3;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;
@Config
public class v3Hardware {
    public DcMotor fpd = null, bpd = null, fsd = null, bsd = null,

    intake = null, aimer = null, portArm = null, starArm = null;

    public Servo shoulderPort = null, shoulderStar = null, elbow = null, extendyBoi = null, wrist = null, door = null, trigger = null;
    public TouchSensor handTS = null;

    public static double doorOpen = 0.5, doorClosed = 0.46;
    public static double shoulderPortIntake = 0; public static double shoulderStarIntake = 0;

    public static double shoulderPortLift = 0.45; public static double shoulderStarLift = 0.3;

    public static double shoulderPortDown = 0.55; public static double shoulderStarDown = 0.2;
    public static double shoulderPortScore = 0.35; public static double shoulderStarScore = 0.425;

    public static double extendyBoiRetract = 0.24; public static double extendyBoiDown = 0.28;
    public static double extendyBoiExtend = 0.77;

    public static double wristDown = 0.4928; public static double wristStar = 0.4325; public static double wristPort = 0.55;
    public static double wristLift = 0.3702;

    public static double elbowPort = 0.6,elbowStar = 0.4, elbowNorminal = 0.497;
    public static double triggerRelease = 0, triggerHold = 0;

    public static double intakeSpeed = -0.8;



    HardwareMap hwMap = null;
    public v3Hardware() {}
    public void runOpMode() {}
    public void init(HardwareMap ahwMap) {
        hwMap = ahwMap;
        fpd = hwMap.get(DcMotor.class, "fpd" );
        bpd = hwMap.get(DcMotor.class, "bpd");
        fsd = hwMap.get(DcMotor.class, "fsd");
        bsd = hwMap.get(DcMotor.class, "bsd");

        portArm = hwMap.get(DcMotor.class, "portArm");
        starArm = hwMap.get(DcMotor.class,"starArm");

        intake = hwMap.get(DcMotor.class, "intake");

        aimer = hwMap.get(DcMotor.class, "aimer");
        elbow = hwMap.get(Servo.class, "elbow");
        wrist = hwMap.get(Servo.class, "wrist");
        trigger = hwMap.get(Servo.class, "trigger");
        shoulderPort = hwMap.get(Servo.class, "shoulderPort");
        shoulderStar = hwMap.get(Servo.class, "shoulderStar");
        extendyBoi = hwMap.get(Servo.class, "extendyBoi");
        door = hwMap.get(Servo.class, "door");
        handTS = hwMap.get(TouchSensor.class, "handTS");
        fpd.setDirection(DcMotorSimple.Direction.REVERSE);
        bpd.setDirection(DcMotorSimple.Direction.FORWARD);
        fsd.setDirection(DcMotorSimple.Direction.REVERSE);
        bsd.setDirection(DcMotorSimple.Direction.REVERSE);

        portArm.setDirection(DcMotorSimple.Direction.FORWARD);
        starArm.setDirection(DcMotorSimple.Direction.REVERSE);
        intake.setDirection(DcMotorSimple.Direction.FORWARD);

        aimer.setDirection(DcMotorSimple.Direction.REVERSE);

        fpd.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        bpd.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        fsd.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        bsd.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        portArm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        starArm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        intake.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        aimer.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        fpd.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        bpd.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        fsd.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        bsd.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        portArm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        starArm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        intake.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        aimer.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
}

