package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Constants;
import frc.robot.Robot;

public class WaitElevatorToPos extends Command{

    int pos = 0;
    public WaitElevatorToPos(int pos){
        this.pos=pos;
        requires(Robot.elevatorSystem);
    }

    public WaitElevatorToPos(int pos, double timeOut){
        this.pos=pos;
        requires(Robot.elevatorSystem);
        setTimeout(timeOut);
    }

    @Override
    protected void initialize() {           
    }

    @Override
    protected void execute() { 
    //this sub is continously call by the robot program 
    Robot.elevatorSystem.setElevatorPosition(pos);      
    }

    @Override
	protected void end() {
    	
    }

    @Override
    protected void interrupted() {
        Robot.elevatorSystem.stopMotor();
    }

    @Override
    protected boolean isFinished() {
        if(Robot.elevatorSystem.getElevatorPosition()>(pos-80) && Robot.elevatorSystem.getElevatorPosition()<(pos+80)){
            return true;
        }else{
            return false;
        }
    }
}