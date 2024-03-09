package com.wigroup.dependencyinjection.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse,
    ): Computer = Computer(monitor, computerTower, keyboard, mouse)

    @Provides
    fun provideComputerTower(
        storage: Storage,
        memory: Memory,
        processor: Processor,
    ): ComputerTower = ComputerTower(storage, memory, processor)

    @Provides
    fun provideKeyboard(): Keyboard = Keyboard()

    @Provides
    fun provideMemory(): Memory = Memory()

    @Provides
    fun provideMonitor(): Monitor = Monitor()

    @Provides
    fun provideMouse(): Mouse = Mouse()

    @Provides
    fun provideProcessor(): Processor = Processor()

    @Provides
    fun provideStorage(): Storage = Storage()
}