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

    @Override
    protected void initialize() {    
        Robot.elevatorSystem.setElevatorPosition(pos);          
    }

    @Override
    protected void execute() { 
    //this sub is continously call by the robot program 
      
    }
    
    @Override
    protected boolean isFinished() {
        if(Robot.elevatorSystem.getElevatorPosition()>(pos-50) && Robot.elevatorSystem.getElevatorPosition()<(pos+50)){
            return true;
        }else{
            return false;
        }
    }
}