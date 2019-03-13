package frc.robot.commands;

import java.util.Optional;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Constants;
import frc.robot.Robot;

public class WaitTurretToPos extends Command{
    int pos = 0;
    double turretSpeed = Constants.turretSpeed;
    public WaitTurretToPos(int pos){
        this.pos=pos;
        requires(Robot.turret);
    }

    public WaitTurretToPos(int pos, double turretSpeed){
        this.pos=pos;
        this.turretSpeed = turretSpeed;
        requires(Robot.turret);
    }

    @Override
    protected void initialize() {
        Robot.turret.setTurretMotor(turretSpeed);
    }

    @Override
    protected void execute() { 
    //this sub is continously call by the robot program 
    Robot.turret.setTurretPos(pos);      
    }

    @Override
    protected boolean isFinished() {
        if(Robot.turret.getPosition()>(pos-30) && Robot.turret.getPosition()<(pos+30)){
            return true;
        }else{
            return false;
        }
    }

    @Override
	protected void end() {
    	Robot.turret.stopMotor();
    }

    @Override
    protected void interrupted() {
        end();
    }
}