package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class Arm2Retract extends InstantCommand {
    public Arm2Retract() {
        requires(Robot.ballCollectorArm2);
    }
    @Override
    protected void execute() {
        Robot.ballCollectorArm2.setMotorTwo(138);
    }
}