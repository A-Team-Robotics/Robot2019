package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants;
import frc.robot.Robot;

public class LoadBallCollector extends CommandGroup{
    public LoadBallCollector(){
        Robot.continueLoad=true;
        addSequential(new Delay());
       addSequential(new StopArmRollers());
       addSequential(new RecieveCargo());
       addSequential(new WaitElevatorToPos(0));
        addSequential(new SlideBack());
        addSequential(new WaitTurretToPos((Constants.turretTurnMaxPos + Constants.turretTurnMinPos)/2));
        addSequential(new zfd(17500,414));
        SmartDashboard.putBoolean("Timer Finished", false);
        addSequential(new Delay2());
        addSequential(new RunRollersFast());
        Robot.continueLoad=false;
       //addSequential(new RetractBallCollector());
    }
}