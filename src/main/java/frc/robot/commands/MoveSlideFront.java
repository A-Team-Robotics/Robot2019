package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Constants;
import frc.robot.Robot;

public class MoveSlideFront extends Command{
    @Override
    protected void execute() {
        if(Robot.slideSystem.getReverseLimit()==true){
            Robot.slideSystem.setMotorSpeed(Constants.slideMotorspeed);
        }
    }

    @Override
    protected boolean isFinished() {
        if(Robot.slideSystem.getReverseLimit()==true){
            System.out.println("The motor reached the limit in the move slide front command.");
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