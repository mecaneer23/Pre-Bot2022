package org.firstinspires.ftc.teamcode.Auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.teamcode.Base.BaseOpMode;
import org.firstinspires.ftc.teamcode.Base.Robot;
import org.firstinspires.ftc.teamcode.Bots.PreBot;
import org.firstinspires.ftc.teamcode.Components.Camera;

@Autonomous
public class DeliverAndParkLeft extends BaseOpMode {
    public PreBot robot;

    Camera.ParkingPosition parkingPosition;

    @Override
    public Robot setRobot() {
        this.robot = new PreBot();
        return this.robot;
    }

    @Override
    public void onInit() throws InterruptedException {
        robot.grabber.close();
    }

    @Override
    public void onStart() throws InterruptedException {
        parkingPosition = robot.camera.getPosition();
        robot.arm.move(robot.arm.HIGH_JUNCTION);
        robot.mecanum.driveForward(8);
        robot.mecanum.strafeRight(36);
        robot.mecanum.driveForward(32);
        robot.grabber.open();
        robot.mecanum.driveBackward(20);
        robot.mecanum.turnLeft();
        robot.arm.move(robot.arm.LOWER_BOUND);
        if (parkingPosition == Camera.ParkingPosition.LEFT) {
            robot.mecanum.driveForward(60);
        } else if (parkingPosition == Camera.ParkingPosition.CENTER) {
            robot.mecanum.driveForward(36);
        } else if (parkingPosition == Camera.ParkingPosition.RIGHT) {
            robot.mecanum.driveForward(12);
        }
        robot.mecanum.turnRight();
    }
}
