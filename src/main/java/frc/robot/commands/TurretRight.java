package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;
import frc.robot.Constants;

public class TurretRight extends CommandGroup{
    public TurretRight(){
        addParallel(new WaitTurretToPos(Constants.turretTurnRightPos));
    }    
}