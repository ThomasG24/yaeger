package nl.han.ica.yaeger.engine.entities.spawners;

import javafx.scene.Node;
import nl.han.ica.yaeger.engine.entities.entity.Entity;
import nl.han.ica.yaeger.engine.entities.entity.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntitySpawnerTest {

    private EntitySpawner entitySpawner;

    private boolean tickHasBeenCalled;

    @BeforeEach
    void setup() {
        entitySpawner = new TestEntitySpawner(1000);
        tickHasBeenCalled = false;
    }

    @Test
    void testTickIsNotCalledImmediatlyAfterCreation() {
        // Setup

        // Test

        // Verify
        assertFalse(tickHasBeenCalled);
    }

    @Test
    void spawnAddsEntitiesToSpawnedEntities() {
        // Setup
        Entity entity = new TestEntity();

        // Test
        entitySpawner.spawn(entity);

        // Verify
        Assertions.assertEquals(1, entitySpawner.getSpawnedEntities().size());
    }

    @Test
    void destroyClearsListOfSpawnedEntities() {
        // Setup
        Entity entity = new TestEntity();

        // Test
        entitySpawner.spawn(entity);
        entitySpawner.destroy();

        // Verify
        Assertions.assertEquals(0, entitySpawner.getSpawnedEntities().size());
    }

    private class TestEntitySpawner extends EntitySpawner {

        TestEntitySpawner(long interval) {
            super(interval);
        }

        @Override
        public void tick() {
            tickHasBeenCalled = true;
        }
    }

    private class TestEntity implements Entity {
        @Override
        public void remove() {

        }

        @Override
        public Node getGameNode() {
            return null;
        }

        @Override
        public Position getPosition() {
            return null;
        }
    }
}
