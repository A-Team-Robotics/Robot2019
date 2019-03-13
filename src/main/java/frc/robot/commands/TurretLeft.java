package frc.robot.commands;


import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;
import frc.robot.Constants;

public class TurretLeft extends CommandGroup{
    public TurretLeft(){
        addParallel(new WaitTurretToPos(Constants.turretTurnLeftPos));
    }    
}