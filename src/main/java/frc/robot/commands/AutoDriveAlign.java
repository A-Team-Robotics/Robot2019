package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class AutoDriveAlign extends Command {

    public AutoDriveAlign(){
        requires(Robot.drive);
    }
    
    @Override
    protected void initialize() {
        
    }

    @Override
    protected void execute() {
        
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

}