package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.RobotMap;
import frc.robot.Constants;

public class shootBall extends CommandGroup{
    public shootBall(){
        addSequential(new SlideFront());
        addSequential(new DeployBall());
    }
}