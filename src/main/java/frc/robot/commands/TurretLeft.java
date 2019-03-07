package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TurretLeft extends Command{
    public TurretLeft(){
        requires(Robot.turret);
    }
    @Override
    protected void initialize() {
        Robot.turret.setTurretMotor(-0.3);
    }
    @Override
    protected void execute() {
        Robot.turret.setTurretMotor(-0.3);
    }

    @Override
    protected boolean isFinished() {
        if(Robot.turret.getLeftLimitSwitch() == false){
            return true;
        }else{
            return false;
        }
    }

    @Override
    protected void end() {
        Robot.turret.stopTurretMotor();
    }

    @Override
    protected void interrupted() {
        Robot.turret.stopTurretMotor();
    }
    
}