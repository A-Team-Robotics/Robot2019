package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class Arm1Retract extends InstantCommand {
    public Arm1Retract() {
        requires(Robot.ballCollector);
    }
    @Override
    protected void execute() {
        Robot.ballCollector.setMotorOne(10);
    }
}