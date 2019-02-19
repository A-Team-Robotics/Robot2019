package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import frc.robot.Robot;

public class MoveSlideBack extends Command{
    @Override
    protected void execute() {
        Robot.slideSystem.setMotorSpeed(-0.3);
    }

    @Override
    protected boolean isFinished() {
        if(Robot.slideSystem.getForwardLimit()==true){
            return true;  
        }else{
            return false;
        } 
    }

    @Override
    protected void end() {
        Robot.slideSystem.stopMotor();
    }
}