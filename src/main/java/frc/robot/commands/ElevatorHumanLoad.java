
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ElevatorHumanLoad extends CommandGroup{
    public ElevatorHumanLoad(){
       addSequential(new WaitElevatorToPos(34711));
    }
}