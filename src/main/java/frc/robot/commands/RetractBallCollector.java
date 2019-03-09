package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class RetractBallCollector extends CommandGroup{
    public RetractBallCollector(){
       // addSequential(new ElevatorLevel2Hatch());
        Timer.delay(0.4);
        addSequential(new StopRollers());
        addParallel(new Arm1Retract());
        addParallel(new Arm2Retract());
        Timer.delay(0.4);
        //addSequential(new ElevatorLoadCargo());
    }
}