package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class DeployBallCollector extends CommandGroup{
    public DeployBallCollector(){
        addSequential(new ElevatorLevel2Hatch());
        addParallel(new Arm1Collect());
        addParallel(new Arm2Collect());
        addSequential(new ExtendArmCollectors());
        addSequential(new StartRollers());
    }
}