package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class WaitElevatorRetract extends Command{

    int pos = 0;
    public WaitElevatorRetract(int pos){
        this.pos=pos;
        requires(Robot.elevatorSystem);
    }
    @Override
    protected void initialize() {
        Robot.elevatorSystem.setElevatorPosition(pos);
    }
    @Override
    protected void execute() {
       
    }

    @Override
    protected boolean isFinished() {
        if(Robot.elevatorSystem.getElevaotrPosition()>(pos-1000)){
            return true;
        }else{
            return false;
        }
    }
}