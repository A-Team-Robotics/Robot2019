package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Climb extends CommandGroup{
    public Climb(){
       addSequential(new WaitElevatorLevel2(30000));
       Timer.delay(1);
       addParallel(new Arm2Collect(250));
       Timer.delay(4);
       addParallel(new Arm1Collect(23438));
       addSequential(new Arm2Collect(219));
       Timer.delay(4);
       addSequential(new ElevatorLoadCargo());
       Timer.delay(4);
       addParallel(new Arm1Collect(29800));
       addParallel(new RunRollers());
    }
}