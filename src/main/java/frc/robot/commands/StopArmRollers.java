package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class StopArmRollers extends InstantCommand{
    public StopArmRollers(){
        requires(Robot.arm);
    }
    @Override
    protected void initialize() {
        Robot.arm.stopRollers();
        //Robot.arm.closeArms();
    }
    @Override
    protected void execute() {
        Robot.arm.stopRollers();
    }

    @Override
	protected void end() {
    	
    }

    @Override
    protected void interrupted() {
        Robot.arm.stopMotor();
    }
}