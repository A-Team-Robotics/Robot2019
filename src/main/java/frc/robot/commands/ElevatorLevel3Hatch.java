package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Constants;
import frc.robot.Robot;

public class ElevatorLevel3Hatch extends CommandGroup{
    public ElevatorLevel3Hatch(){
       addSequential(new WaitElevatorToPos(Constants.elevatorLevelThree));
    }
}