package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LoadBallCollector extends CommandGroup{
    public LoadBallCollector(){
       addParallel(new StopRollers());
    }
}