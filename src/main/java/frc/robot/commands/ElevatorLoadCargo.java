package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class ElevatorLoadCargo extends InstantCommand{

    public ElevatorLoadCargo(){
        requires(Robot.elevatorSystem);
    }
    @Override
    protected void execute() {
        Robot.elevatorSystem.setElevatorPosition(10);
    }
}