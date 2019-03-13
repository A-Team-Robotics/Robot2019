package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Constants;
import frc.robot.Robot;

public class StopTurret extends InstantCommand {

    public StopTurret(){
        requires(Robot.turret);
    }

    @Override
    protected void initialize() {
        Robot.turret.stopMotor();
    }
    
    @Override
    protected void execute() {
        Robot.turret.stopMotor();
    }
}