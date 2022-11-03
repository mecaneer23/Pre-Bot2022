package org.firstinspires.ftc.teamcode.Bots;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.Base.Robot;
import org.firstinspires.ftc.teamcode.Components.Arm;
import org.firstinspires.ftc.teamcode.Components.Camera;
import org.firstinspires.ftc.teamcode.Components.Grabber;
import org.firstinspires.ftc.teamcode.Components.AutoMecanum;

public class PreBot extends Robot {
    public AutoMecanum mecanum;
    public Arm arm;
    public Grabber grabber;
    public Camera camera;

    @Override
    protected void initBot(HardwareMap hardwareMap, Telemetry telemetry, LinearOpMode opMode) {

        this.mecanum = new AutoMecanum(
                opMode,
                "frontLeft",
                "frontRight",
                "backLeft",
                "backRight",
                hardwareMap,
                telemetry,
                0.1,
                0.5,
                10.5,
                12.5,
                1.1,
                100,
                false,
                0,
                0,
                0
        );
        this.arm = new Arm("arm", hardwareMap, telemetry);
        this.grabber = new Grabber("grabber", hardwareMap, telemetry);
        this.camera = new Camera("Webcam 1", hardwareMap, telemetry);

        addComponents(mecanum, arm, grabber, camera);
    }
}