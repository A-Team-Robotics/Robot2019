package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import frc.robot.Robot;

public class closeArm extends Command{
    @Override
    protected void execute() {
        Robot.arm.closeArms();
        Robot.arm.stopRollers();
    }

    @Override
    protected boolean isFinished() {
        return true;
    }
}