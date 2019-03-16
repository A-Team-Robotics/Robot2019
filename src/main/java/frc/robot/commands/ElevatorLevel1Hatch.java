
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Constants;

public class ElevatorLevel1Hatch extends CommandGroup{
    public ElevatorLevel1Hatch(){
       addSequential(new WaitElevatorToPos(Constants.elevatorLevelOne));
    }
}