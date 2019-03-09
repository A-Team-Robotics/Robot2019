package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class WaitElevatorLevel2 extends Command{

    public WaitElevatorLevel2(){
        requires(Robot.elevatorSystem);
    }
    @Override
    protected void initialize() {
        Robot.elevatorSystem.setElevatorPosition(41948);
    }
    @Override
    protected void execute() {
       
    }

    @Override
    protected boolean isFinished() {
        if(Robot.elevatorSystem.getElevaotrPosition()<41800){
            return false;
        }else{
            return true;
        }
    }
}