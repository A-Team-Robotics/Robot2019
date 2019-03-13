package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Constants;
import frc.robot.Robot;

public class MoveSlideBack extends Command{
    @Override
    protected void execute() {
        if(Robot.slideSystem.getForwardLimit()==true){
            Robot.slideSystem.setMotorSpeed(Constants.slideMotorspeed*-1);
        }      
    }

    @Override
    protected boolean isFinished() {
        if(Robot.slideSystem.getForwardLimit()==true){
            System.out.println("The motor reached the limit in the MoveSlideBack Command.");
            Robot.slideSystem.stopMotor();
            return true;  
        }else{
            return false;
        } 
    }

    protected void interrupted() {
        Robot.slideSystem.stopMotor();
    }
}