package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class Arm2Collect extends InstantCommand {
    public Arm2Collect() {
        requires(Robot.ballCollectorArm2);
    }
    @Override
    protected void execute() {
        Robot.ballCollectorArm2.setMotorTwo(8);
    }
    @Override
    protected void interrupted() {
    }
}