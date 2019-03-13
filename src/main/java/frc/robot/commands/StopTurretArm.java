package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.RobotMap;
import frc.robot.Constants;
import frc.robot.Robot;

public class StopTurretArm extends CommandGroup{
    public StopTurretArm(){
        if(Robot.gripperSystem.getButton()==false){
            addParallel(new ReadyGripper());
       }
    }
}