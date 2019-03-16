
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ElevatorCargoLoad extends CommandGroup{
    public ElevatorCargoLoad(){
       addSequential(new WaitElevatorToPos(49000));
    }
}