package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.RobotMap;
import frc.robot.Constants;
import frc.robot.Robot;

public class DeliverPayLoad extends CommandGroup{
    public DeliverPayLoad(){
        switch (Robot.loadItem){
            case "hatch":
            addSequential(new SlideFront());
            addSequential(new DeployHatch());
            case "ball" :
            addSequential(new SlideFront());
            addSequential(new DeployBall());
            case "none" :
        }
    }
}