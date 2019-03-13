package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class RunRollersReverse extends InstantCommand{
    public RunRollersReverse(){
        requires(Robot.arm);
    }
    @Override
    protected void initialize() {
            Robot.arm.setRollersReverse();
    }
    
    @Override
	protected void end() {
    	Robot.arm.stopMotor();
    }

    @Override
    protected void interrupted() {
        end();
    }    
}