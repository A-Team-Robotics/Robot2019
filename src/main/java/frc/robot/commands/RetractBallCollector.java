package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class RetractBallCollector extends CommandGroup{
    public RetractBallCollector(){
        addParallel(new WaitElevatorRetract(30000));
        //addSequential(new WaitElevatorLevel2(30000));
        Timer.delay(1);
        addSequential(new StopRollers());
        addParallel(new Arm1Retract(5));
        addSequential(new WaitArm2Retract(412));
        Timer.delay(0.4);
        addSequential(new ElevatorLoadCargo());
    }
}