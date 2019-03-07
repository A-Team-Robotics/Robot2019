package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class ElevatorLevel2Hatch extends InstantCommand{

    public ElevatorLevel2Hatch(){
        requires(Robot.elevatorSystem);
    }
    @Override
    protected void execute() {
        Robot.elevatorSystem.setElevatorPosition(41948);
    }
}