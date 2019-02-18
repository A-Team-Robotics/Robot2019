package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class XboxDrive extends Command {

    public XboxDrive(){
        requires(Robot.drive);
    }
    @Override
    protected void execute() {
        Robot.drive.arcadeDrive(Robot.m_oi.xboxController);
    }

    @Override
    protected void initialize() {
        Robot.drive.arcadeDrive(Robot.m_oi.xboxController);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}