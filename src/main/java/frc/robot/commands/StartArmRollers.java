package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class StartArmRollers extends InstantCommand{
    public StartArmRollers(){
        requires(Robot.arm);
    }
    @Override
    protected void initialize() {
            Robot.arm.setRollersForward();
            Robot.arm.openArms();
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