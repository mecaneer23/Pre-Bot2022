package org.firstinspires.ftc.teamcode.Auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Base.BaseOpMode;
import org.firstinspires.ftc.teamcode.Base.Robot;
import org.firstinspires.ftc.teamcode.Bots.PreBot;
import org.firstinspires.ftc.teamcode.Components.AutoMecanum;

@Autonomous
public class TestAuto extends BaseOpMode {
    public PreBot robot;

    @Override
    public Robot setRobot() {
        this.robot = new PreBot();
        return this.robot;
    }

    @Override
    public void onStart() throws InterruptedException {
        robot.mecanum.driveForward(24);
    }
}