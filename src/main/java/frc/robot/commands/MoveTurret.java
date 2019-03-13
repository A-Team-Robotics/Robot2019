package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Constants;
import frc.robot.Robot;

public class MoveTurret extends Command {

    public MoveTurret(){
        requires(Robot.turret);
    }
    
    @Override
    protected void execute() {
        Robot.turret.setTurretPos(Robot.turret.map(Robot.m_oi.joystickController.getThrottle(), -1, 1,Constants.turretTurnMinPos,Constants.turretTurnMaxPos));//200, 7500
        if(Robot.turret.getLeftLimitSwitch()==false||Robot.turret.getRightLimitSwitch()==false){
            Robot.turret.stopMotor();
        }
    }
    @Override
    protected boolean isFinished() {
         if(Robot.turret.getLeftLimitSwitch()==false||Robot.turret.getRightLimitSwitch()==false){
            return true;
        }else{
            return false;
        }
    }
    protected void interrupted() {
        Robot.turret.stopMotor();
    }

}