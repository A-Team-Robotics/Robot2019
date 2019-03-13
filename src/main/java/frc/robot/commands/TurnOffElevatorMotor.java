package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TurnOffElevatorMotor extends Command{

    int pos = 0;
    public TurnOffElevatorMotor(){
        requires(Robot.elevatorSystem);
    }
    @Override
    protected void initialize() {
        Robot.elevatorSystem.stopMotor();
    }

    @Override
    protected void execute() {
        Robot.elevatorSystem.stopMotor();
    }

    @Override
    protected boolean isFinished() {        
            return true;
    }

    @Override
	protected void end() {
    	
    }

    @Override
    protected void interrupted() {
        Robot.elevatorSystem.stopMotor();
    }
}