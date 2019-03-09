package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class CloseArmSpin extends InstantCommand {
    public CloseArmSpin() {
        requires(Robot.arm);
    }
    @Override
    protected void execute() {
       Robot.arm.closeArms();
    }
    @Override
    protected void interrupted() {
        
    }
}