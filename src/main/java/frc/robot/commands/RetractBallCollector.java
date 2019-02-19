package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class RetractBallCollector extends CommandGroup{
    public RetractBallCollector(){
        addSequential(new ElevatorLevel2Hatch());
        addSequential(new StopRollers());
        addSequential(new RetractArmCollectors());
        addParallel(new Arm1Retract());
        addParallel(new Arm2Retract());
        addSequential(new RetractBallCollector());
    }
}