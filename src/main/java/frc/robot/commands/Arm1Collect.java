package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class Arm1Collect extends InstantCommand {
    public Arm1Collect() {
        requires(Robot.ballCollector);
    }
    @Override
    protected void execute() {
        Robot.ballCollector.setMotorOne(3000);
    }
}