import React from 'react';
import { AppRegistry, StyleSheet, Text, View } from 'react-native';

class PropertyDetails extends React.Component {
    render() {
        return (
            <View style={styles.container}>
                <Text style={styles.label}>
                    React Native Property Details
                </Text>
            </View>
        );
    }
}

var styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        backgroundColor: 'white',
    },
    label: {
        fontSize: 24,
        textAlign: 'center',
        margin: 10
    }
});

AppRegistry.registerComponent('RNPropertyDetails', () => PropertyDetails);