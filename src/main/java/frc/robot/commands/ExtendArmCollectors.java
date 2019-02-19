package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class ExtendArmCollectors extends InstantCommand{
    public ExtendArmCollectors(){
        requires(Robot.ballCollector);
    }
    @Override
    protected void execute() {
        Robot.ballCollector.openArms();
    }
}