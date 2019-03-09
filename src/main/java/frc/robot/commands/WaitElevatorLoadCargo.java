package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class WaitElevatorLoadCargo extends Command{

    public WaitElevatorLoadCargo(){
        requires(Robot.elevatorSystem);
    }
    @Override
    protected void execute() {
        
    }
    @Override
    protected void initialize() {
        Robot.elevatorSystem.setElevatorPosition(5);
    }

    @Override
    protected boolean isFinished() {
        if(Robot.elevatorSystem.getElevaotrPosition()<9000){
            return true;
        }else{
            System.out.println("Elevator is Not less than 9000");
            return false;
        }
    }
}