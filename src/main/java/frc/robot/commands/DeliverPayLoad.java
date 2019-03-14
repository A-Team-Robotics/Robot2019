package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.InstantCommand;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.RobotMap;
import frc.robot.Constants;
import frc.robot.Robot;

// public class DeliverPayLoad extends CommandGroup{
//     public DeliverPayLoad(){
        
//         addSequential(new SlideFront());
//         addSequential(new DeployHatch());
//        

//         }
//     }
// }
public class DeliverPayLoad extends InstantCommand{
    public DeliverPayLoad(){
    }
    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        switch (Robot.loadItem){
            case "hatch":
            System.out.println("Deploying hatch");
            Scheduler.getInstance().add(new SlideFront());
            Scheduler.getInstance().add(new DeployHatch());
            case "ball" :
            System.out.println("Deploying ball");
            Scheduler.getInstance().add(new SlideFront());
            Scheduler.getInstance().add(new DeployBall());
            case "none" :
                System.out.println("Nothing to deploy");
        }
    }

    @Override
	protected void end() {    	
    }

    @Override
    protected void interrupted() {
        
    }
}