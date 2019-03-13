
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Constants;
import frc.robot.Robot;

public class ElevatorLevel2Hatch extends CommandGroup{
    public ElevatorLevel2Hatch(){
       addSequential(new WaitElevatorToPos(Constants.elevatorLeveltwo));
    }
}