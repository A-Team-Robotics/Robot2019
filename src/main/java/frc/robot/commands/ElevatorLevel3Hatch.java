package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class ElevatorLevel3Hatch extends InstantCommand{

    public ElevatorLevel3Hatch(){
        requires(Robot.elevatorSystem);
    }
    @Override
    protected void execute() {
        Robot.elevatorSystem.setElevatorPosition(94000);
    }
}